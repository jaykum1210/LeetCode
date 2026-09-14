class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int ori = image[sr][sc];
        if(ori==color) return image;

        dfs(image,sr,sc,ori,color);
        return image;
    }
    public static void dfs(int[][] image, int row, int column, int ori, int color){
        if(row<0 || row>=image.length || column<0 || column>=image[0].length) return;

        if(image[row][column]!=ori) return;

        image[row][column] = color;

        dfs(image, row+1,column,ori,color);
        dfs(image, row-1,column,ori,color);
        dfs(image, row,column+1,ori,color);
        dfs(image, row,column-1,ori,color);
    }
}
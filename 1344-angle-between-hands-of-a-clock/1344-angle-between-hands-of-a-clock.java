class Solution {
    public double angleClock(int hour, int minutes) {
        hour%=12;
        double min = 6*minutes;
        double hou1 = 30*hour;
        double hou2 = minutes*(0.5);
        double num  = Math.abs(min-(hou1+hou2));
        return Math.min(num,360-num);
    }
}
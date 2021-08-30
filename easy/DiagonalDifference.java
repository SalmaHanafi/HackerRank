//https://www.hackerrank.com/challenges/diagonal-difference/problem

class Result {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int d1=0, d2=0, len= arr.size()-1;
        for(int i=0; i<=len; i++){
            d1 += arr.get(i).get(i);
            d2 += arr.get(i).get(len-i);
        }

        return Math.abs(d1-d2);
    }
}

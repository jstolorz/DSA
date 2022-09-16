package datastructures;

class BigO {
    public static void main(String[] args) {


        constantN(20,50);

        squaredN(20);

        nonDominants(20);

    }

    // example O(2n) => remove constant n + n
    //static void constantN(int n) {
    // improve inputs
    static void constantN(int a, int b) {
        for (int i = 0; i < a; i++) {
            System.out.println("i: " + i);
        }

        for (int j = 0; j < b; j++) {
            System.out.println("j: " + j);
        }

    }

    // example of O(n^2) squared n * n === n * n ... * n
    static void squaredN(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("i: " + i + " j: " + j);
            }
        }
    }

    // example 0(n^2 + n) => 0(n^2)
    static void nonDominants(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("i: " + i + " j: " + j);
            }
        }

        for (int k = 0; k < n; k++) {
            System.out.println("k: " + k);
        }
    }

    // example of 0(1)
    static int addItems(int n){
        return n + n;
    }


    // example of 0(log n) quicksort



}


package com.javatest;

public class test {

    public class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Point point = (Point) obj;
            return x == point.x && y == point.y;
        }
    }

    public static void main(String[] args) {
        int line1 = 3;
        int line2 = 4;
        int line3 = 5;

        if (isTriangle(line1, line2, line3)) {
            System.out.println("是三角形");
        } else {
            System.out.println("不是三角形");
        }
    }

    public static boolean isTriangle(int a, int b, int c){
        return (a + b > c & a + c > b & b + c > a);
    }
}

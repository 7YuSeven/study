package com.javaproject;

public class Test04 {
    public static void main(String[] args) {
        /*
        27, 22, 30, 40, 36, 13, 19, 16, 20, 18, 43, 50, 48
         */

        int[] arr = {27, 22, 30, 40, 36,    //22-40
                13, 19, 16, 20, 18,         //13-20
                43, 50, 48};                //43-50

        BlockSearch blockSearch1 = new BlockSearch(22, 40, 0, 4);
        BlockSearch blockSearch2 = new BlockSearch(13, 20, 5, 9);
        BlockSearch blockSearch3 = new BlockSearch(43, 50, 10, 12);

        BlockSearch[] blockSearchs = {blockSearch1, blockSearch2, blockSearch3};

        int number = 19;

        int temp = getNum(blockSearchs, arr, number);
        if (temp == -1) {
            System.out.println("该数不存在");
        } else {
            System.out.println(temp);
        }

    }

    public static int getNum(BlockSearch[] blockSearchs, int[] arr, int num) {
        int index = getIndex(blockSearchs, num);

        if (index == -1) {
            return -1;
        }

        int start = blockSearchs[index].getStartIndex();
        int end = blockSearchs[index].getEndIndex();

        for (int i = start; i < end; i++) {
            if (arr[i] == num) {
                return i;
            }
        }

        return -1;
    }

    public static int getIndex(BlockSearch[] blockSearchs, int num) {
        for (int i = 0; i < blockSearchs.length; i++) {
            if (num >= blockSearchs[i].getMin() && num <= blockSearchs[i].getMax()) {
                return i;
            }
        }

        return -1;
    }
}

class BlockSearch {
    private int min;
    private int max;
    private int startIndex;
    private int endIndex;


    public BlockSearch() {
    }

    public BlockSearch(int min, int max, int startIndex, int endIndex) {
        this.min = min;
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    /**
     * 获取
     * @return min
     */
    public int getMin() {
        return min;
    }

    /**
     * 设置
     * @param min
     */
    public void setMin(int min) {
        this.min = min;
    }

    /**
     * 获取
     * @return max
     */
    public int getMax() {
        return max;
    }

    /**
     * 设置
     * @param max
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * 获取
     * @return startIndex
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * 设置
     * @param startIndex
     */
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * 获取
     * @return endIndex
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * 设置
     * @param endIndex
     */
    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public String toString() {
        return "Block{min = " + min + ", max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}

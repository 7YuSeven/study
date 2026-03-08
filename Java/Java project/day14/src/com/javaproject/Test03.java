package com.javaproject;

public class Test03 {
    public static void main(String[] args) {
        //分块查找
        int[] arr = {16,5,9,12,21,18,
                32,23,37,26,45,34,
                50,48,61,52,73,66};

        Block block1 = new Block(21, 0, 5);
        Block block2 = new Block(45, 6, 11);
        Block block3 = new Block(66, 12, 17);

        Block[] blocks = {block1, block2, block3};

        int num = 16;

        int temp = getNum(blocks, arr, num);
        if (temp == -1) {
            System.out.println("该数不存在");
        } else {
            System.out.println(temp);
        }
    }

    public static int getNum(Block[] blocks,int[] arr, int num) {
        int number = getIndex(blocks, num);

        if (number == -1) {
            return -1;
        } else {
            int min = blocks[number].getIndex1();
            int max = blocks[number].getIndex2();
            for (int i = min; i <= max; i++) {
                if (arr[i] == num) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static int getIndex(Block[] arr, int number){
        for (int i = 0; i < arr.length; i++) {
            if (number <= arr[i].getMax()) {
                return i;
            }
        }

        return -1;
    }
}

class Block{
    private int max;
    private int index1;
    private int index2;


    public Block() {
    }

    public Block(int max, int index1, int index2) {
        this.max = max;
        this.index1 = index1;
        this.index2 = index2;
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
     * @return index1
     */
    public int getIndex1() {
        return index1;
    }

    /**
     * 设置
     * @param index1
     */
    public void setIndex1(int index1) {
        this.index1 = index1;
    }

    /**
     * 获取
     * @return index2
     */
    public int getIndex2() {
        return index2;
    }

    /**
     * 设置
     * @param index2
     */
    public void setIndex2(int index2) {
        this.index2 = index2;
    }

    public String toString() {
        return "Block{max = " + max + ", index1 = " + index1 + ", index2 = " + index2 + "}";
    }
}

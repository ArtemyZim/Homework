package com.company.laba5;

class Example14_05 {

    private int num;

    Example14_05(){
        num = 0;
    }
    Example14_05(int num){
        if (num > 100) this.num = 100;
        else this.num = num;
    }


    public void setNum(int num){
        if (num > 100) this.num = 100;
        else this.num = num;
    }
    public void setNum(){
        num = 0;
    }
    public void outputNum(){
        System.out.println("Проверка значения num.");
        System.out.println("num равен " + num);
    }
}

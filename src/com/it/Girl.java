package com.it;

public class Girl {
    private final String name;
    private final int age;

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public  Girl(){
        this("Cate", 30);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Go To Hell");   }

    public Girl(String name, int age){

        this.name = name;
        this.age = age;
    }

    public boolean presentGift(Box_1 gift ) {
        if (gift.volume1()>500) {
            return true;
        }
        return false;

    }

    public String goToRestarant(String rest) {
        if (!"Mac".equals(rest)) {
            return "Yes";
        }
        return "No";

    }
}

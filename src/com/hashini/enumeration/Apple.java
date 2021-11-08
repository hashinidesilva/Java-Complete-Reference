package com.hashini.enumeration;

enum Apple {
    Jonathan(10), GoldenDel(9), Winesap(15);

    private int price;

    Apple(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }
}
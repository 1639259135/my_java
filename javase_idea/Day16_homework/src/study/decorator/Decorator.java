package study.decorator;

import study.componet.饮品;

public abstract class Decorator extends 饮品 {

    饮品 yp;

    public Decorator(饮品 yp) {
        this.yp = yp;
    }
}

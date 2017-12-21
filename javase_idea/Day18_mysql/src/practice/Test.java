package practice;

/**
 * 单列模式:
 * 1,某各类只能有一个实列
 * 2,他必须自行创建这个实例对象
 * 3,
 */


//饿汉式:
public class Test {

    private Test() {

    }

    static Test test = new Test();

    public static Test getTest() {
        return test;
    }
}

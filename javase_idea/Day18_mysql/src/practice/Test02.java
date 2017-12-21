package practice;


//懒汉式:
public class Test02 {

    private Test02() {

    }

    static Test02 test02 = null;

    public static Test02 getTest02() {
        if (test02 == null){
            synchronized (Test02.class){
                if (test02 == null){
                    test02 = new Test02();
                }
            }
        }


        return test02;
    }
}

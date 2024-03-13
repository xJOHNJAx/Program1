package Homework3;
public class FirstLesson {
    public static void main(String[] args) {
        Object[] objects = {new Apple( "Антоновка", 3), new Orange( "Green",  100)};
        for (int i = 0; i < objects.length; i++){
            System.out.println(objects[i]);
        }
    }
}

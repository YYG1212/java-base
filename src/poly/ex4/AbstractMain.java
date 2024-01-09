package poly.ex4;

public class AbstractMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();


        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
        moveAnimal(dog);
        moveAnimal(cat);
        moveAnimal(caw);
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 시작");
        animal.sound();
        System.out.println("동물 소리 종료");
    }

    private static void moveAnimal(AbstractAnimal animal) {
        System.out.println("동물 이동 시작");
        animal.move();
        System.out.println("동물 이동 종료");
    }
}

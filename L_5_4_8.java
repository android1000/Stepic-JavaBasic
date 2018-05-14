import java.io.*;
import java.util.Objects;

public class L_5_4_8
{
    public static void main(String[] args) throws Exception {
        Animal[] animals = new Animal[]{new Animal("1"), new Animal("2"), new Animal("3")};
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeInt(animals.length);
        for (Animal animal : animals) {
            objectOutputStream.writeObject(animal);
        }
        objectOutputStream.flush();
        Animal[] restoreAnimals = deserializeAnimalArray(byteArrayOutputStream.toByteArray());
        for (Animal animal : restoreAnimals) {
            System.out.println(animal.toString());
        }

    }

    public static Animal[] deserializeAnimalArray(byte[] data) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(data))) {
            int count = objectInputStream.readInt();
            Animal[] animals = new Animal[count];
            for (int i=0;i<count;i++){
                animals[i]=(Animal)objectInputStream.readObject();
            }
            return animals;
        } catch (IOException | ClassNotFoundException | ClassCastException e){
            throw new java.lang.IllegalArgumentException(e.getMessage());
        }
    }

}
class Animal implements Serializable {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            return Objects.equals(name, ((Animal) obj).name);
        }
        return false;
    }

    @Override
    public String toString() {
        return name;
    }
}
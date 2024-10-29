package org.example;

public class Mapper {

    public CatDto map(Cat cat) {
        System.out.println("Зашел в метод MAp!");
        CatDto catDto = new CatDto();
        catDto.setAge(cat.getAge());
        catDto.setName(cat.getName());
        catDto.setOwnerName(cat.getOwner().getName());
        return catDto;
    }
}

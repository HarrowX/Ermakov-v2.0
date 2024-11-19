package xyz.alexandrit.cats;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Cat implements Meowable {
    private String name;

    @Override
    public void meow() {
        meow(1);
    }

    public void meow(int n) {
        if (n < 0)
            throw new IllegalArgumentException();
        if (n == 0) {
            System.out.println();
            return;
        }
        String out = STR."\{"meow-".repeat(Math.max(0, n - 1))}meow";
        System.out.println(out);
    }

    @Override
    public String toString() {
        return STR."cat: \{name}";
    }
}

class A {
    A A;

    A() {
    }

    A(A A) {
        this.A = A;
    }

    A A() {
        return A;
    }

    A A(A A) {
        return A;
    }
}

package com.customUtils;

public class StrategyPattern {
    public abstract class Robot {
        private String name;
        private AttackStrategy attackStrategy;
        private MovingStrategy movingStrategy;

        public Robot(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void attack() {
            attackStrategy.attack();
        }

        public void move() {
            movingStrategy.move();
        }

        // 집약 관계, 전체 객체가 메모리에서 사라진다 해도 부분 객체는 사라지지 않는다.
        // setter 메서드
        public void setAttackStrategy(AttackStrategy attackStrategy) {
            this.attackStrategy = attackStrategy;
        }

        public void setMovingStrategy(MovingStrategy movingStrategy) {
            this.movingStrategy = movingStrategy;
        }
    }

    public class TaekwonV extends Robot {
        public TaekwonV(String name) {
            super(name);
        }
    }

    public class Atom extends Robot {
        public Atom(String name) {
            super(name);
        }
    }

    // 인터페이스
    interface AttackStrategy {
        public void attack();
    }

    // 구체적인 클래스
    public class MissileStrategy implements AttackStrategy {
        public void attack() {
            System.out.println("I have Missile.");
        }
    }

    public class PunchStrategy implements AttackStrategy {
        public void attack() {
            System.out.println("I have strong punch.");
        }
    }

    // 인터페이스
    interface MovingStrategy {
        public void move();
    }

    // 구체적인 클래스
    public class FlyingStrategy implements MovingStrategy {
        public void move() {
            System.out.println("I can fly.");
        }
    }

    public class WalkingStrategy implements MovingStrategy {
        public void move() {
            System.out.println("I can only walk.");
        }
    }
    public void strategyPattern() {
        Robot taekwonV = new TaekwonV("TaekwonV");
        Robot atom = new Atom("Atom");

        /* 수정된 부분: 전략 변경 방법 */
        taekwonV.setMovingStrategy(new WalkingStrategy());
        taekwonV.setAttackStrategy(new MissileStrategy());
        atom.setMovingStrategy(new FlyingStrategy());
        atom.setAttackStrategy(new PunchStrategy());

        /* 아래부터는 동일 */
        System.out.println("My name is " + taekwonV.getName());
        taekwonV.move();
        taekwonV.attack();

        System.out.println("Change Attack Strategy of " + taekwonV.getName());
        taekwonV.setAttackStrategy(new PunchStrategy());
        taekwonV.attack();

        System.out.println();
        System.out.println("My name is " + atom.getName());
        atom.move();
        atom.attack();
    }
}

public class L_3_3_12 {

    public static void main(String[] args) {
        Robot r = new Robot(0, 0, Direction.DOWN);
        r.moveRobot(r, 2, 3);
        System.out.println(r.getX() + " " + r.getY() + " " + r.getDirection());
    }
}

class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public Robot() {
        this.x = 0;
        this.y = 0;
        this.direction = Direction.UP;
    }

    public Direction getDirection() {
        // текущее направление взгляда
        return this.direction;
    }

    public int getX() {
        // текущая координата X
        return this.x;
    }

    public int getY() {
        // текущая координата Y
        return this.y;
    }

    public void turnLeft() {
        // повернуться на 90 градусов против часовой стрелки
        switch (this.getDirection()) {
            case UP:
                direction = Direction.LEFT;
                break;
            case LEFT:
                direction = Direction.DOWN;
                break;
            case DOWN:
                direction = Direction.RIGHT;
                break;
            case RIGHT:
                direction = Direction.UP;
                break;
        }
    }

    public void turnRight() {
        // повернуться на 90 градусов по часовой стрелке
        switch (this.getDirection()) {
            case UP:
                direction = Direction.RIGHT;
                break;
            case RIGHT:
                direction = Direction.DOWN;
                break;
            case DOWN:
                direction = Direction.LEFT;
                break;
            case LEFT:
                direction = Direction.UP;
                break;
        }
    }

    public void stepForward() {
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
        switch (getDirection()) {
            case UP:
                this.y++;
                break;
            case RIGHT:
                this.x++;
                break;
            case DOWN:
                this.y--;
                break;
            case LEFT:
                this.x--;
                break;
        }
    }


    public static void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        } else {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
        } else {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}

enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT
}

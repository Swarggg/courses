public class RobotMovement {

    public static void main(String[] args) {


        Robot robot = new Robot();
        System.out.println("Robot on position:\n"+"Y="+robot.getY()+"\nX="+robot.getX()+"\nDirect="+robot.nowDirection+"\n");

        int targetY=-20;
        int targetX=-30;


        System.out.println("Target coordinate:\n"+"Y="+targetY+"\nX="+targetX+"\n");

        moveRobot( robot,targetX, targetY);



       System.out.println("Result:\n"+"Y="+robot.getY()+"\nX="+robot.getX()+"\nDirect="+robot.nowDirection);

        if (targetX== robot.getX()&&targetY== robot.getY()) {
            System.out.println("robot on target");
        } else System.out.println("robot missed");

    }

    public static class Robot  {

        Direction nowDirection=Direction.RIGHT;
        int y = 3;
        int x = -33;

        public Direction getDirection() {
            // текущее направление взгляда
            return nowDirection;
        }
        public int getX() {
            // текущая координата X
            return x;
        }
        public int getY() {
            // текущая координата Y
            return y;
        }
        public void turnLeft() {
            // повернуться на 90 градусов против часовой стрелки
            switch (nowDirection) {
                default:
                case UP: nowDirection = Direction.LEFT;
                    break;
                case LEFT: nowDirection = Direction.DOWN;
                    break;
                case DOWN: nowDirection = Direction.RIGHT;
                    break;
                case RIGHT: nowDirection = Direction.UP;
                    break;
            }
        }
        public void turnRight() {
            // повернуться на 90 градусов по часовой стрелке
            switch (nowDirection) {
                default:
                case UP:nowDirection = Direction.RIGHT;
                    break;
                case LEFT:nowDirection = Direction.UP;
                    break;
                case DOWN:nowDirection = Direction.LEFT;
                    break;
                case RIGHT:nowDirection = Direction.DOWN;
                    break;
            }
        }
        public void stepForward() {
            // шаг в направлении взгляда
            // за один шаг робот изменяет одну свою координату на единицу
            switch (nowDirection) {
                case UP:y++;
                    break;
                case DOWN:y--;
                    break;
                case LEFT:x--;
                    break;
                case RIGHT:x++;
                    break;
            }
        }
        public enum Direction {
            UP,
            DOWN,
            LEFT,
            RIGHT
        }

    }



    public static void moveRobot(Robot robot, int toX, int toY) {

       int diferentX = toX - robot.getX();
       int diferentY = toY - robot.getY();

        //вывод диферента для отладки
        System.out.println("вывод диферента для отладки:\n"+"dif Y="+diferentY+"\ndif X="+diferentX+"\nRobot direct="+robot.getDirection()+"\n");

        switch (robot.getDirection()) {
            case RIGHT: robot.turnLeft();
                break;
            case LEFT: robot.turnRight();
                break;
            case DOWN: robot.turnRight();
                        robot.turnRight();
                break;
            default: break;
        }


       if (diferentY>=0) {
           for (int i=0; i<=Math.abs(diferentY)-1; i++) {
               robot.stepForward();
           }
       } else {
           robot.turnLeft(); robot.turnLeft();
           for (int i=0; i<=Math.abs(diferentY)-1; i++) {
               robot.stepForward();
           }
        }


        switch (robot.getDirection()) {
              case DOWN: robot.turnRight();
                robot.turnRight();
                break;
            default: break;
        }


        if (diferentX>=0) {
            robot.turnRight();
            for (int i=0; i<=Math.abs(diferentX)-1; i++) {
                robot.stepForward();
            }
        } else {
            robot.turnLeft();
            for (int i=0; i<=Math.abs(diferentX)-1; i++) {
                robot.stepForward();
            }
        }










    }




}

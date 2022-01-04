package learning.java.stepik.ConnectRobotToMove;


/*

public class RobotConnect implements RobotConnection, RobotConnectionManager{
   int robotNowInX = 0;
   int robotNowInY= 0;



    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {


        public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
            //int quantityConnectErrors = 0;
            //RobotConnection test=robotConnectionManager.getConnection();
            for (int i=1; i<4; i++) {
                try (RobotConnection test=robotConnectionManager.getConnection()) {
                    // устанавливает соединение с роботом
                    //robotConnectionManager.getConnection();
                    //двигает робота
                    test.moveRobotTo(toX, toY);

                    i=400;

                } catch (RobotConnectionException rce) {
                    if (i==3) {
                        throw new RobotConnectionException("3 times connect error");
                    }

                } catch (Throwable e){
                    throw e;
                }

            } //for close block

        } // close moveRobot block
    }



    @Override
    public RobotConnection getConnection() {

        public void moveRobotTo(int toX, int toY) {
            int robotNowInX = toX;
            int robotNowInY= toY;
        }

        return null;
    }

    @Override
    public void moveRobotTo(int x, int y) {

    }

    @Override
    public void close() {

    }
}


*/
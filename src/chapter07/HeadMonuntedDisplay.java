package chapter07;

// VR
public abstract class HeadMonuntedDisplay implements Wearable,Skinnable, Display{ // 다중 상속
    private  String vendor;  //제조사

    private int skin;

    public HeadMonuntedDisplay(String vendor, int skin){
        this.vendor = vendor;
        this.skin = skin;
    }

    public abstract void displayVRScene();

    @Override
    public void changeSkin(int skin) {
        this.skin = skin;
    }

    @Override
    public void putOn() {
        System.out.println("착용 합니다");
    }

    @Override
    public void putOff() {
        System.out.println("해재 합니다");
    }

    @Override
    public void show(String content) {
        System.out.println("[" + vendor + "사 제품] 화면에 표시: " + content);
    }


    public String putSkin() {
        switch (skin) {
            case BLACK:
                System.out.println("BLACK DISPLAY");
                break;
            case RED:
                System.out.println("RED DISPLAY");
                break;
            case GREEN:
                System.out.println("GREEN DISPLAY");
                break;
            case BLUE:
                System.out.println("BLUE DISPLAY");
                break;
            case YELLOW:
                System.out.println("YELLOW DISPLAY");


        }
        return "Unknown";
    }


}

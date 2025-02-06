package chapter07;

public class HeadMonuntedDisplayTestr {
    public static void main(String[] args) {
        HeadMonuntedDisplay vrDevice = new HeadMonuntedDisplay("Meta",Skinnable.BLACK) {
            public void displayVRScene() {
                show("VR 장면을 랜더링" );
            }
        };



        vrDevice.putOn();
        vrDevice.putOff();
        vrDevice.changeSkin(Skinnable.YELLOW); //스킨 변경
        vrDevice.putSkin(); // 스킨 표시
        vrDevice.displayVRScene();

        Wearable w = vrDevice;
        w.putOn();
        w.putOff();

        Skinnable s = vrDevice;
        s.changeSkin(Skinnable.BLACK); //스킨 변경

        vrDevice.putSkin(); // 스킨 표시

    }
}

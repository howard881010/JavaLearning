package d4_polymorphic_test;

public class Computer {
    // 提供一個安裝入口
    public void installUSB(USB usb) {
        usb.connect();
        //獨有功能
        if (usb instanceof Mouse) {
            Mouse m = (Mouse) usb;
            m.click();
        } else if (usb instanceof KeyBoard) {
            KeyBoard k = (KeyBoard) usb;
            k.keyDown();
        }
        usb.unConnect();
    }
}

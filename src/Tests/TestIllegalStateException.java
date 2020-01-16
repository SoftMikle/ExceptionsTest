package Tests;

public class TestIllegalStateException {
    int heightOfDisplayInPx;
    int widthOfDisplayInPx;

    public TestIllegalStateException(int heightOfDisplayInPx, int widthOfDisplayInPx) {
        this.heightOfDisplayInPx = heightOfDisplayInPx;
        this.widthOfDisplayInPx = widthOfDisplayInPx;
    }

    public int getHeightOfDisplayInPx() {
        return heightOfDisplayInPx;
    }

    public void setHeightOfDisplayInPx(int heightOfDisplayInPx) {
        this.heightOfDisplayInPx = heightOfDisplayInPx;
        if(heightOfDisplayInPx < 0){
            throw new IllegalStateException("Illegal state for Display");
        }
    }

    public int getWidthOfDisplayInPx() {
        return widthOfDisplayInPx;
    }

    public void setWidthOfDisplayInPx(int widthOfDisplayInPx) {
        this.widthOfDisplayInPx = widthOfDisplayInPx;
        if(heightOfDisplayInPx < 0){
            throw new IllegalStateException("Illegal state for Display");
        }
    }
}

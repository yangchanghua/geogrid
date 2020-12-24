# geogrid
对某个城市进行经纬度网格化，以某个Point为中心，网格大小单位公里。经纬度本身不是直线，但在城市范围内，可简化为直线。也就是网格简化为正方形。

从经纬度到公里的转换在GeoDistance中已经实现。

核心数据类：
public class GeoGrid {
    private Point topLeft;
    private Point bottomRight;
    private Point outerTL;
    private Point outerBR;
}

前两个字段表示了网格本身的左上角和右下角。
生成的网格，外面还有一个大正方形，后两个字段表示大正方形的左上和右下经纬度。
接口
    List<GeoGrid> generateGridForCity(Point center, int gridSize, int outerPadding, int cnt);
中，outerPadding表示从网格本身的边，到外围大正方形的距离，单位公里。

cnt 表示中心网格的各方向的网格行列数量。比如cnt为10,表示整个网格应该是（10×2）+ 1 行/列的正方形。


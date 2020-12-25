# geogrid
对某个城市进行经纬度网格化，以某个Point为中心，网格大小单位公里。经纬度本身不是直线，但在城市范围内，可简化为直线。也就是网格简化为正方形。

从经纬度到公里的转换在GeoDistance中已经实现。

核心数据类：
`public class GeoGrid {
    private Point topLeft;
    private Point bottomRight;
    private Point outerTL;
    private Point outerBR;
}`

前两个字段表示了网格本身的左上角和右下角。
生成的网格，外面还有一个大正方形，后两个字段表示大正方形的左上和右下经纬度。
接口
    List<GeoGrid> generateGridForCity(Point center, int gridSize, int outerPadding, int cnt);
中，outerPadding表示从网格本身的边，到外围大正方形的距离，单位公里。

cnt 表示中心网格的各方向的网格行列数量。比如cnt为10,表示整个网格应该是（10×2）+ 1 行/列的正方形。





# store-service

需求：
设计实现一个简单的商家服务，具体需求如下

1. 完成Rest接口设计和实现，及接口文档。不需要实现web页面。

2. 数据库建表SQL

3. 功能需求列表：

3.1 商家入驻：商家提供名称，地址，菜系类别（如川菜，东北菜，火锅等）

3.2 上架菜品：菜品有名称，标签(每个菜品可支持多个标签），价格，制作时间等属性。

3.3 按商家名称搜索商家列表

3.4 按菜品名称搜索商家列表

3.5 按菜品标签搜索商家列表

3.6 默认排序为价格从低到高

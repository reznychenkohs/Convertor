package ProductCost;

public class CalcCostDelivery extends CalcCostBase {

    private final static double deliveryPrice = 7.0 ;

    @Override
    public double calcCost(Product product) {
        return product.getQuota() * product.getPrice()
                + deliveryPrice;
    }
}

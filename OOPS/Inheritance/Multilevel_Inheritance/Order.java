class Order {
    String orderId;
    String orderDate;

    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order " + orderId + " placed on " + orderDate + " is currently: Processing.";
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    String getOrderStatus() {
        return super.getOrderStatus() + " It has been shipped. Tracking: " + trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    String getOrderStatus() {
        return "Order " + orderId + " was delivered on " + deliveryDate + ".";
    }
}

class MultilevelOrderDemo {
    public static void main(String[] args) {
        DeliveredOrder finalOrder = new DeliveredOrder(
            "RTL9001",
            "2024-10-25",
            "TRK123456",
            "2024-11-01"
        );
        System.out.println(finalOrder.getOrderStatus());
    }
}

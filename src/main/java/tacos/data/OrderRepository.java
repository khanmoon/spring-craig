package tacos.data;

import tacos.Order;

/**
 * OrderRepository
 */
public interface OrderRepository {

    Order save(Order order);
}
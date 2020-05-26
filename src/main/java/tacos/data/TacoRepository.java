package tacos.data;

import tacos.Taco;

/**
 * TacoRepository
 */
public interface TacoRepository {

    Taco save(Taco taco);
}
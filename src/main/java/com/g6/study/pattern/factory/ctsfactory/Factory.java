package com.g6.study.pattern.factory.ctsfactory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * @Author hx
 * @Date 2019/3/25 10:49 PM
 * @Version 1.0
 * @Description TODO
 */

public class Factory {

    final static Map<String,Supplier<Product>> map = new HashMap<>();
    static{
        map.put("loan",Loan::new);
        map.put("stock",Stock::new);
        map.put("bond",Bond::new);
    }

    public static Product createProduct(String name){
        Supplier<Product> productSupplier = map.get(name);
        if(productSupplier!=null)return productSupplier.get();
        throw new IllegalArgumentException("No such product " + name);
    }


}

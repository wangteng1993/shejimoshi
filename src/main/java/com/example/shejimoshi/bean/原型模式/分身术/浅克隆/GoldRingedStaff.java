package com.example.shejimoshi.bean.原型模式.分身术.浅克隆;

import lombok.Data;

/**
 * 金箍棒
 */
@Data
public class GoldRingedStaff {
    float height = 100.00f;
    float radius = 10.00f;

    /**
     * 变大
     */
    void grow() {
        this.height = this.height * 2;
        this.radius = this.radius * 2;
    }

    /**
     * 变小
     */
    void shrink() {
        this.height = this.height / 2;
        this.radius = this.radius / 2;
    }

}


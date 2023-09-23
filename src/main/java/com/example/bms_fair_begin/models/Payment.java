package com.example.bms_fair_begin.models;

import com.example.bms_fair_begin.models.enums.PaymentMode;
import com.example.bms_fair_begin.models.enums.PaymentStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.relational.core.mapping.Embedded;

import java.sql.Date;
import java.sql.Time;

@Getter
@Setter
@Entity
@ToString
public class Payment extends BaseModel {

    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus paymentStatus;
    @Enumerated(EnumType.ORDINAL)
    private PaymentMode paymentMode;
    @OneToOne
    private Ticket ticket;

    private int amount;
    private String transactionId;
    private Date paymentTime;
}

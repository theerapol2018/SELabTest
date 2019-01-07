package com.example.demo.entity;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode
@Table( name = "CoffeeDelivery")
public class CoffeeDelivery {
    @Id
    @SequenceGenerator(name="coffeeDelivery_seq",sequenceName="coffeeDelivery_seq")
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="coffeeDelivery_seq")
    private @NonNull long coffeeDeliveryID;
    private String address;
    private int priece;
    private String coffeeType;

    @ManyToOne(fetch = FetchType.EAGER)
         private  Member member;
    @ManyToOne(fetch = FetchType.EAGER)
        private  OrderType orderType;
    @ManyToMany(fetch= FetchType.EAGER)
     private List<Manu> manus;


        }

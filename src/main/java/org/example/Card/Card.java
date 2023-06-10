package org.example.Card;

import lombok.Getter;

@Getter
public class Card {
    private Long bankId;
    private Long bankUserId;

    public Card(Long bankId, Long bankUserId) {
        this.bankId = bankId;
        this.bankUserId = bankUserId;
    }
}

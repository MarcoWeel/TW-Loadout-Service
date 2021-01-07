package com.tacticalwolves.accountapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Loadout")
public class Loadout {
    @Id
    @GeneratedValue
    private int Id;
    private int UserName;
    private int Description;
}


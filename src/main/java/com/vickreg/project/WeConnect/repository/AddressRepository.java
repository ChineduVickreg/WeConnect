package com.vickreg.project.WeConnect.repository;

import com.vickreg.project.WeConnect.model.user.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}

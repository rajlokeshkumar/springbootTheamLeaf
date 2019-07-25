package net.javaguides.springboot.tutorial.repo;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import net.javaguides.springboot.tutorial.entity.TripRegister;


@EnableScan
public interface TripRegisterRepository extends CrudRepository<TripRegister, String> {

}

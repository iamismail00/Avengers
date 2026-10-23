package Ismail.DemoSpring;

import Ismail.DemoSpring.Model.AvengersModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvengersRepo extends JpaRepository<AvengersModel,Integer> {
}

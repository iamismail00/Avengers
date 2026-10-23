            package Ismail.DemoSpring.Service;


            import Ismail.DemoSpring.AvengersRepo;
            import Ismail.DemoSpring.Model.AvengersModel;
            import org.springframework.beans.factory.annotation.Autowired;
            import org.springframework.stereotype.Service;

            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.List;

            @Service

            public class AvengersService {


                @Autowired
                AvengersRepo avengersRepo;



                public List<AvengersModel> getall() {
                    return  avengersRepo.findAll();

                }

                public AvengersModel getbyID(int no) {
                    return avengersRepo.findById(no).orElse(new AvengersModel());

                }

                public String addtheAvengers(AvengersModel avengersModel) {
                    avengersRepo.save(avengersModel);
                    return "Success";

                }

                public String deleteId(int id) {
                    avengersRepo.deleteById(id);
                    return "Deleted";
                }

                public String update(AvengersModel avengersModel) {
                    avengersRepo.save(avengersModel);
                    return "Updated";
                }
            }

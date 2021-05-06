package pricelistapp.pricelist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import pricelistapp.pricelist.repository.RoleRepository;
import pricelistapp.pricelist.repository.UserRepository;

public class DataLoader implements ApplicationRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }

//    Iterable<UserEntity> users = userRepository.findAll();
//    boolean hasAdmin = false;

//    for (UserEntity userEntity : users) {
//        for (RoleEntity roleEntity : userEntity.getRoles()) {
//            if (roleEntity.getName().equals("ADMIN")) {
//                hasAdmin = true;
//                break;
//            }
//        }
//    }
//
//        if (!hasAdmin) {
//        UserEntity admin = new UserEntity();
//        admin.setUsername("admin");
//        admin.setPassword(passwordEncoder.encode("admin"));
//
//
//        Collection<RoleEntity> roles = new ArrayList<>();
//        for (RoleEntity roleEntity : roleRepository.findAll()) {
//            roles.add(roleEntity);
//        }
//
//        admin.setRoles(roles);
//
//        userRepository.save(admin);
//    }
}



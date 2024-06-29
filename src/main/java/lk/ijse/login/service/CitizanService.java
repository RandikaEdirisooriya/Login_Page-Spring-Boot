package lk.ijse.login.service;

import jakarta.transaction.Transactional;
import lk.ijse.login.Dto.CitizanDto;
import lk.ijse.login.entity.Citizan;
import lk.ijse.login.repo.CitizanRepo;
import lk.ijse.login.utill.Varlist;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CitizanService {
    @Autowired
    private CitizanRepo citizanRepo;
    @Autowired
    private ModelMapper modelMapper;

    public String SaveCitizan(CitizanDto citizanDto){
        if(citizanRepo.existsById(citizanDto.getId())){
            return Varlist.RSP_DUPLICATED;
        }else {
            citizanRepo.save(modelMapper.map(citizanDto, Citizan.class));
            return Varlist.RSP_SUCCESS;
        }/*   */
    }
    public CitizanDto getCitizanByPassword(String first_name,String password){
        Citizan citizan=  citizanRepo.findByFirstNameAndPassword(first_name,password);
        return modelMapper.map(citizan,CitizanDto.class);
    }
}

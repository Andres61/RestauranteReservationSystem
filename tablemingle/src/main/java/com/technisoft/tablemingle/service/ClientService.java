package com.technisoft.tablemingle.service;

import com.technisoft.tablemingle.dto.ClientDTO;
import com.technisoft.tablemingle.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
@Autowired
    private ClientFactoryService clientFactoryService;
@Autowired
    private ClientRepository clientRepository;

    public ClientDTO save(ClientDTO clientDTO){
        return clientFactoryService.createClientDTO(clientRepository.save(clientFactoryService.createClient(clientDTO)));
    }

    public List<ClientDTO> findAll(){
        return clientFactoryService.createClientDTO(clientRepository.findAll());
    }
    public ClientDTO findById(Integer id){
        return clientFactoryService.createClientDTO(clientRepository.findById(id).get());
    }

    public void deleteById(Integer id){
        clientRepository.deleteById(id);
    }

}

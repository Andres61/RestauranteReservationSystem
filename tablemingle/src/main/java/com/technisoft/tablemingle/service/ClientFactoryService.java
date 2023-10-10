package com.technisoft.tablemingle.service;

import com.technisoft.tablemingle.dto.ClientDTO;
import com.technisoft.tablemingle.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientFactoryService {

    public Client createClient(ClientDTO clientDTO){
        return new Client(clientDTO);
    }

    public ClientDTO createClientDTO(Client client){
        return new ClientDTO(client);
    }

    public List<ClientDTO> createClientDTO (List<Client> listClient){
        List<ClientDTO> clientDTOS = new ArrayList<>();
        listClient.forEach(client -> clientDTOS.add(createClientDTO(client)));
        return clientDTOS;
    }
}

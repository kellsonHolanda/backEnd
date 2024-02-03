package dao;

import java.util.Collection;
import java.util.TreeMap;
import java.util.Map;


import domain.Cliente;

public class ClienteMapDAO implements IClienteDAO{

    private Map<Long, Cliente> map;
    
    public ClienteMapDAO() {
        map = new TreeMap<>();
    }

    



    @Override
    public Boolean cadastrar(Cliente cliente) {
        if (this.map.containsKey(cliente.getCpf())){
            return false;
        }
        this.map.put(cliente.getCpf(), cliente);
        return true;
    }


    @Override
    public void excluir(Long cpf) {
        Cliente cadastroDeCliente = this.map.get(cpf);
        if (cadastroDeCliente!=null){
            this.map.remove(cadastroDeCliente.getCpf(), cadastroDeCliente);
        }

    }

    @Override
    public void alterar(Cliente cliente) {
        Cliente cadastroDeCliente = this.map.get(cliente.getCpf());
        if (cadastroDeCliente!=null){
            cadastroDeCliente.setNome(cliente.getNome());
            cadastroDeCliente.setCpf(cliente.getCpf());
            cadastroDeCliente.setTel(cliente.getTel());
            cadastroDeCliente.setNumero(cliente.getNumero());
            cadastroDeCliente.setEnder(cliente.getEnder());
            cadastroDeCliente.setCidade(cliente.getCidade());
            cadastroDeCliente.setEstado(cliente.getEstado());
            }
    }

    @Override
    public Cliente consultar(Long cpf) {
        return this.map.get(cpf);
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return this.map.values();
    }
}

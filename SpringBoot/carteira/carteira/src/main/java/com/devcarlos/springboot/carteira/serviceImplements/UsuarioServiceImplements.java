package com.devcarlos.springboot.carteira.serviceImplements;

import com.devcarlos.springboot.carteira.model.Usuario;
import com.devcarlos.springboot.carteira.repository.UsuarioRepository;
import com.devcarlos.springboot.carteira.service.UsuarioService;

import net.bytebuddy.implementation.bytecode.Throw;

public class UsuarioServiceImplements implements UsuarioService {

	
	private UsuarioRepository usuarioRepository;
	
	
	
	public UsuarioServiceImplements(UsuarioRepository usuarioRepository) {
		super();
		this.usuarioRepository = usuarioRepository;
	}

	@Override
	public Usuario autenticar(String email, String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario cadastrarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validadeEmail(String email) {
		
		if(usuarioRepository.existsByemail(email)) {
			throw new UsuarioException("O email ja existe");
		}
		
	}

	
	
}

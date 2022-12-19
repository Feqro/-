package com.example.project.room;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.project.member.LoginInput;
import com.example.project.member.Member;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class RoomService {
	private final RoomRepository roomRepository;
	
	
	public List<Room> getRoomTypeList(String roomType){
		
		return this.roomRepository.findByRoomType(roomType);
	}
	
	public List<Room> getAllList(){
		return this.roomRepository.findAll();
	}
	
	public Room getRoom(String roomNo) {
		
		Optional<Room> oRoom = this.roomRepository.findByRoomNo(roomNo);
		if(oRoom.isPresent()) {
			Room room = oRoom.get();
			
			return room;
		}
		
		return null;
	}
	
	public String getRoomType(String roomNo) {
		
		Optional<Room> oRoom = this.roomRepository.findByRoomNo(roomNo);
		if(oRoom.isPresent()) {
			Room room = oRoom.get();
			
			return room.getRoomType();
		}
		
		return null;
	}
	
	

}

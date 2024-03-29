package ma.ehei.tp.service.id.impl;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.stereotype.Service;

import ma.ehei.tp.service.id.IdGenerateur;
@Service
public class TimeStampIdGenerateur implements IdGenerateur{
	@Override
	public String genererID()
	{
		Date date = new Date();
		
		return null;
	}
}

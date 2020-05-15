package websocket_chat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import websocket_chat.domain.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {

}

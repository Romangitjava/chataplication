package websocket_chat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import websocket_chat.domain.User;

public interface UserDetailsRepository extends JpaRepository<User, String> {
}

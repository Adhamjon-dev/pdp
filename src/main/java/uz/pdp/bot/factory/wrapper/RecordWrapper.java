package uz.pdp.bot.factory.wrapper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class RecordWrapper {
    private UUID id;
    private String name;
    private String command;
}

create table public.users
(
    user_id       bigserial
        primary key,
    password_hash varchar(255) not null,
    username      varchar(255) not null
        constraint uk_r43af9ap4edm43mmtq01oddj6
            unique
);

create table if not exists public.messages
(
    message_id      bigserial
        primary key,
    message_content varchar(255) not null,
    timestamp       timestamp(6) not null,
    receiver_id     bigint       not null
        constraint fkt05r0b6n0iis8u7dfna4xdh73
            references public.users,
    sender_id       bigint       not null
        constraint fk4ui4nnwntodh6wjvck53dbk9m
            references public.users
);


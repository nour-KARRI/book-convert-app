export interface ChapterRequestPayload{
    kitab: string;
    chapter: string;
    hadithName: string;
    isnaad: string
    matn: string
    takhrij: string
    tahkeek: string
}

export interface HadithRequestPayload{
    id: number
    name: string
    isnaad: string
    matn: string
    takhrij: string
    hamesh: string
    basamLink: string
    san3aniLink: string
    uthaymeenLink: string
}

export interface HadithTranslationRequestPayload{
    id: number
    langCode: string
    name: string;
    isnaad: string
    matn: string
    takhrij: string
    hamesh: string
}